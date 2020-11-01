package com.kooproject.material;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    private RecyclerView rv_menu;
    private ArrayList<String> MenuList;
    private MenuAdapter menuAdapter;
    private LinearLayoutManager llm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        rv_menu = (RecyclerView) findViewById(R.id.rv_main);
        llm = new LinearLayoutManager(this);

        MenuList = new ArrayList();
        MenuList.add("BottomNavigation");
        MenuList.add("Snackbars");
        MenuList.add("메뉴 3번가");
        MenuList.add("메뉴 4번가");
        MenuList.add("메뉴 5번가");
        MenuList.add("메뉴 6번가");
        MenuList.add("메뉴 7번가");
        MenuList.add("메뉴 8번가");
        MenuList.add("메뉴 9번가");
        MenuList.add("메뉴 10번가");
        MenuList.add("메뉴 11번가");
        MenuList.add("메뉴 12번가");
        MenuList.add("메뉴 13번가");
        MenuList.add("메뉴 14번가");
        MenuList.add("메뉴 15번가");
        MenuList.add("메뉴 16번가");


        menuAdapter = new MenuAdapter(MenuList);
        rv_menu.setLayoutManager(llm);
        rv_menu.setAdapter(menuAdapter);

        menuAdapter.setOnItemClickListener(new MenuAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, String menuname) {
                intentmenu(position,menuname);
            }
        });
    }
    private void intentmenu(int position, String menuname){
        switch (menuname){
            case "Chips" :
                Intent intent_chips = new Intent(MenuActivity.this,Menu_Chips.class);
                startActivity(intent_chips);
                break;
            case "BottomNavigation" :
                Intent intent_bottomnavi = new Intent(MenuActivity.this, Menu_BottomNavigation.class);
                startActivity(intent_bottomnavi);
                break;
            case "Snackbars" :
                Intent intent_snackbars = new Intent(MenuActivity.this, Menu_Snackbars.class);
                startActivity(intent_snackbars);
                break;

        }
    }
}
