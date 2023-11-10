package br.com.heiderlopes.listaimagens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var recyclerViewHorizontal: RecyclerView? = null

    private var imageAdapter: ImageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample image URLs
        val imageUrls: MutableList<String> = ArrayList()
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/38988.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/18878.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/28161.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/38890.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24164.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17835.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17629.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17631.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17634.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17639.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17652.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17658.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17662.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17648.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17665.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17681.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17668.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17692.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17698.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17697.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17713.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17870.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17884.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17893.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17891.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17910.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17912.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17919.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/18879.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/19296.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/18864.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/19157.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/19672.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/19675.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/20784.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/19673.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/20719.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/20785.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/23377.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/22838.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/23524.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/23385.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/22390.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/20946.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/21542.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/23465.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/23659.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24645.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24006.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24164.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24143.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/23993.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24620.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24288.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/25947.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/25279.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/25163.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/26113.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/20678.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/26875.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/28161.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/27223.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/24534.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/26877.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/28175.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/28777.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/28775.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/29343.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/28773.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/30511.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/30167.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/31211.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/30615.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/32675.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/31942.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/31287.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/32787.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/33061.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/32789.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/33159.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/35161.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/41828.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/38890.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/44939.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/36382.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/46163.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/46269.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/47537.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17608.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/47165.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/50557.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/51275.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/51271.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/51277.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/55981.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/15371.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17619.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/57593.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17571.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17612.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17727.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17753.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17743.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17752.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17740.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17748.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17770.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17797.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17806.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17814.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17780.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17772.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17790.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17762.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17777.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17835.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17817.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17848.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17824.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17841.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17846.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17818.png")
        imageUrls.add("https://ui.awin.com/images/upload/merchant/profile/17867.png")
        // Add more image URLs as needed

        recyclerView = findViewById(R.id.recycler_view)
        recyclerViewHorizontal = findViewById(R.id.recycler_view_horizontal)

        imageAdapter = ImageAdapter(this, imageUrls)

        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerViewHorizontal?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        recyclerView?.adapter = imageAdapter
        recyclerViewHorizontal?.adapter = imageAdapter
    }
}