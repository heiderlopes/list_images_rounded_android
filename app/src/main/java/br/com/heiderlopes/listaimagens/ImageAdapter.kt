package br.com.heiderlopes.listaimagens

import android.R.attr.x
import android.R.attr.y
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso


class ImageAdapter(private val context: Context, private val imageUrls: List<String>) :
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageUrl = imageUrls[position]
        //Picasso.get().load(imageUrl).into(holder.imageView)
        //holder.imageView.setBackgroundColor(ContextCompat.getColor(holder.imageView.context, R.color.white))

        Picasso.get()
            .load(imageUrl)
            .into(holder.imageView, object : Callback {
                override fun onSuccess() {
                    setColorByPosition(holder.imageView)
                }

                override fun onError(e: Exception?) {

                }
            })


//        Picasso.get()
//            .load(imageUrl)
//            .into(holder.imageView, object : Callback {
//                override fun onSuccess() {
//                    val bitmap = (holder.imageView.drawable as BitmapDrawable).bitmap
//                    Palette.Builder(bitmap).generate {
//                        it?.let { palette ->
//                            val dominantColor = palette.getDominantColor(
//                                ContextCompat.getColor(
//                                    context,
//                                    R.color.white
//                                )
//                            )
//                            val corDominante = palette.getDominantColor(
//                                ContextCompat.getColor(
//                                    holder.imageView.context,
//                                    R.color.white
//                                )
//                            )
//
//                            val corVibrante = palette.getVibrantColor(
//                                ContextCompat.getColor(
//                                    holder.imageView.context,
//                                    R.color.white
//                                )
//                            )
//
//                            val corMuda = palette.getMutedColor(
//                                ContextCompat.getColor(
//                                    holder.imageView.context,
//                                    R.color.white
//                                )
//                            )
//
//                            holder.imageView.setBackgroundColor(corMuda)
//                        }
//                    }
//
//                    val drawable = holder.imageView.background as ColorDrawable
//                    holder.imageView.setBackgroundColor(drawable.color)
//
//                }
//
//                override fun onError(e: Exception?) {
//
//                }
//            })
    }

    override fun getItemCount(): Int {
        return imageUrls.size
    }

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView

        init {
            imageView = itemView.findViewById(R.id.image_view)
        }
    }

    private fun setColorByPosition(imageView: ImageView) {
        val bitmap = (imageView.drawable as BitmapDrawable).bitmap
        val pixelColor = bitmap.getPixel(0, 0)
        val alpha = Color.alpha(pixelColor)
        val red = Color.red(pixelColor)
        val green = Color.green(pixelColor)
        val blue = Color.blue(pixelColor)

        imageView.setBackgroundColor(pixelColor)
    }

    private fun setBackgroundColorByPosition(imageView: ImageView) {
        val bitmap = (imageView.drawable as BitmapDrawable).bitmap

        val width = bitmap.width
        val height = bitmap.height;

        val newBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        val backgroundColor =
            Color.WHITE; // Cor de fundo que você deseja remover (branco neste caso)

        for (x in 0 until width) {
            for (y in 0 until height) {
                val pixelColor = bitmap.getPixel(x, y)
                if (pixelColor != backgroundColor) {
                    newBitmap.setPixel(x, y, pixelColor)
                } else {
                    newBitmap.setPixel(x, y, Color.TRANSPARENT)
                }
            }
        }
        imageView.setImageBitmap(newBitmap);
    }
}