package com.example.hasee.prictice9;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import static android.R.attr.mode;
import static android.R.attr.name;
import static com.example.hasee.prictice9.R.id.rank;

public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mManager;
    private List<Student> mStudent=new ArrayList<Student>();
    private void init(){
        Student stu1=new Student("塔兹米","大一");
        mStudent.add(stu1);
        Student stu2=new Student("赤瞳","大二");
        mStudent.add(stu2);
        Student stu3=new Student("玛茵","大一");
        mStudent.add(stu3);
        Student stu4=new Student("雷欧奈","大三");
        mStudent.add(stu4);
        Student stu5=new Student("拉伯克","大四");
        mStudent.add(stu5);
        Student stu6=new Student("希尔","大二");
        mStudent.add(stu6);
        Student stu7=new Student("布兰德","大三");
        mStudent.add(stu7);
        Student stu8=new Student("娜洁希坦","大四");
        mStudent.add(stu8);
        Student stu9=new Student("须佐之男","大二");
        mStudent.add(stu9);
        Student stu10=new Student("切尔茜","大三");
        mStudent.add(stu10);
        Student stu11=new Student("布德大将军","大一");
        mStudent.add(stu11);
        Student stu12=new Student("艾斯德斯","大二");
        mStudent.add(stu12);
        Student stu13=new Student("黑瞳","大三");
        mStudent.add(stu13);
        Student stu14=new Student("威尔","大四");
        mStudent.add(stu14);
        Student stu15=new Student("赛琉","大四");
        mStudent.add(stu15);
        Student stu16=new Student("兰","大二");
        mStudent.add(stu16);
        Student stu17=new Student("Dr.时尚","大三");
        mStudent.add(stu17);
        Student stu18=new Student("波鲁斯","大四");
        mStudent.add(stu18);
        Student stu19=new Student("利瓦","大二");
        mStudent.add(stu19);
        Student stu20=new Student("妮乌","大三");
        mStudent.add(stu20);
        Student stu21=new Student("达伊达斯","大一");
        mStudent.add(stu21);
        Student stu22=new Student("大臣","大二");
        mStudent.add(stu22);
        Student stu23=new Student("皇帝","大四");
        mStudent.add(stu23);
    }
    private HomeAdapter myAdapter;
    class Student{
        private String mName;
        private String mRank;
        public Student(String name,String rank){
            this.mName=name;
            this.mRank=rank;
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        mManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mManager);
        myAdapter=new HomeAdapter(mStudent);
        mRecyclerView.setAdapter(myAdapter);
}
    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

        private List<Student> students=null;
        public HomeAdapter(List<Student> students){
            this.students=mStudent;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(MainActivity.this).inflate(R.layout.student_item, parent, false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.name.setText(students.get(position).mName);
            holder.rank.setText(students.get(position).mRank);
        }

        @Override
        public int getItemCount() {
            return mStudent.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            TextView rank;
            TextView name;
            public MyViewHolder(View view) {
                super(view);
                name = (TextView) view.findViewById(R.id.name);
                rank=(TextView)view.findViewById(R.id.rank);
            }
        }
    }
}