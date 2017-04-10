package com.josecuentas.android_coordinatorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

  private RecyclerView mRecyclerView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    LinearLayoutManager llm = new LinearLayoutManager(this);
    llm.setOrientation(LinearLayoutManager.VERTICAL);
    mRecyclerView.setHasFixedSize(true);
    mRecyclerView.setLayoutManager(llm);
    mRecyclerView.setAdapter(new RecyclerView.Adapter() {
      @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new RecyclerView.ViewHolder(view) {};
      }

      @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

      }

      @Override public int getItemCount() {
        return 30;
      }
    });
  }
}
