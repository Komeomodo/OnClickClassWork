package com.example.onclickclasswork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterClass.onClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listItems = arrayListOf(
            MemberClass(R.drawable.contact3, resources.getString(R.string.student1)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student2)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student3)) ,
            MemberClass(R.drawable.user, resources.getString(R.string.student4)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student5)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student6)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student7)),
            MemberClass(R.drawable.contact1, resources.getString(R.string.student8)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student9)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student10)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student11)),
            MemberClass(R.drawable.contact2, resources.getString(R.string.student12))

        )

        var mainAdapter = AdapterClass(listItems, this)

        rv_cycle.adapter = mainAdapter
        rv_cycle.layoutManager = LinearLayoutManager(this)


    }

    override fun click(data: MemberClass) {
        Toast.makeText(this, data.title,Toast.LENGTH_SHORT).show()
    }
}