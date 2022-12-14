package com.example.lms

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lms.databinding.ActivityMainBinding
import com.example.lms.fragment.TodoListFragment
import com.google.android.material.bottomsheet.BottomSheetDialog


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰 바인딩
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // 탭 설정
//        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                // 탭이 선택 되었을 때
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                // 탭이 선택되지 않은 상태로 변경 되었을 때
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                // 이미 선택된 탭이 다시 선택 되었을 때
//            }
//        })

        // 뷰페이저에 어댑터 연결
        binding.pager.adapter = ViewPagerAdapter(this)

//        // 탭과 뷰페이저 연결
//        TabLayoutMediator(binding.tabLayout, binding.pager) {tab, position ->
//            when(position) {
//                0 -> tab.text = "TodoList"
//                1 -> tab.text = "Calender"
//            }
//        }.attach()


    }



    fun change_to_Menu() {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view, TodoListFragment()).commit()
    }

}