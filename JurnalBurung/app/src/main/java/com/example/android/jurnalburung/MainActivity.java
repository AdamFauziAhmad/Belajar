/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.jurnalburung;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * This app demonstrates images used as buttons and a floating action button to
 * use an intent to launch a second activity. The app lets a user tap an image
 * to make a choice. The app displays a Toast message showing the user’s choice
 * and sends the choice as data with an intent to launch the second activity.
 */
public class MainActivity extends AppCompatActivity {

//    List<Bird> birdList;

//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter adapter;
//    private RecyclerView.LayoutManager layoutManager;

    // Tag for the intent extra.
    public static final String EXTRA_MESSAGE =
            "com.example.android.jurnalburung.extra.MESSAGE";

    // The order message, displayed in the Toast and sent to the new Activity.
    private String mOrderMessage;

    /**
     * Creates the content view, the toolbar, and the floating action button.
     *
     * This method is provided in the Basic Activity template.
     *
     * @param savedInstanceState Saved instance state bundle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList<Bird> birdArrayList =
//                new ArrayList<>();
//        birdArrayList.add(new Bird("kenari", R.drawable.kenari));
//        birdArrayList.add(new Bird("kenari", R.drawable.kenari));
//        birdArrayList.add(new Bird("kenari", R.drawable.kenari));
//
//        recyclerView = findViewById(R.id.recycleviewid);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        adapter = new Recyclerview_adapter(birdArrayList);
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);


//        birdList = new ArrayList<>();
//        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
//        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
//        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
//
//        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycleviewid) ;
//        Recyclerview_adapter myadap = new Recyclerview_adapter(birdList,this);
//        myrv.setLayoutManager(new GridLayoutManager(this, 1));
//        myrv.setAdapter(myadap);







        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navilistener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Content_main()).commit();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
                startActivity(intent);
                displayToast(getString(R.string.action_order_massage));
            }
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navilistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new Content_main();
                            displayToast(getString(R.string.menuhome));
                            break;
                        case R.id.nav_edit:
                            selectedFragment = new Edit();
                            displayToast(getString(R.string.menuedit));
                            break;
                        case R.id.nav_cari:
                            selectedFragment = new Search();
                            displayToast(getString(R.string.menucari));
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, selectedFragment).commit();
                    return true;
                }
            };



    /**
     * Inflates the menu, and adds items to the action bar if it is present.
     *
     * @param menu Menu to inflate.
     * @return Returns true if the menu inflated.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    /**
     * Handles app bar item clicks.
     *
     * @param item Item clicked.
     * @return True if one of the defined items was clicked.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();
        switch (item.getItemId()){
            case R.id.action_order:
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
                startActivity(intent);
                displayToast(getString(R.string.action_order_massage));
                return true;
            case R.id.action_ststus:
                displayToast(getString(R.string.action_status_massage));
                return true;
            case R.id.action_favotites:
                displayToast(getString(R.string.action_favorites_massage));
                return true;
            case R.id.action_contact:
                displayToast(getString(R.string.action_contact_massage));
                return true;
                default:
                    //diem
        }
        // This comment suppresses the Android Studio warning about simplifying
        // the return statements.
        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_order) {
//            return true;
//        }
//        if (id == R.id.action_contact){
//            return true;
//        }
//        if (id == R.id.action_ststus){
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays a Toast with the message.
     *
     * @param message Message to display.
     */
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Shows a message that the donut image was clicked.
     */
    public void showDonutOrder(View view) {
        mOrderMessage = getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
    }

    /**
     * Shows a message that the ice cream sandwich image was clicked.
     */
    public void showIceCreamOrder(View view) {
        mOrderMessage = getString(R.string.ice_cream_order_message);
        displayToast(mOrderMessage);
    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    public void showFroyoOrder(View view) {
        mOrderMessage = getString(R.string.froyo_order_message);
        displayToast(mOrderMessage);
    }

}
