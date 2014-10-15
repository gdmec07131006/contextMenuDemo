package cn.edu.gdmec.c07131006.cxp;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	final static int CONTEXT_MENU_1	=Menu.FIRST;
	final static int CONTEXT_MENU_2	=Menu.FIRST+1;
	final static int CONTEXT_MENU_3	=Menu.FIRST+2;
	TextView myTv;
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		menu.setHeaderTitle("快捷菜单选项");
		menu.add(0,CONTEXT_MENU_1,0,"菜单选项1");
		menu.add(0,CONTEXT_MENU_2,2,"菜单选项2");
		menu.add(0,CONTEXT_MENU_3,3,"菜单选项3");
		super.onCreateContextMenu(menu, v, menuInfo);
	}


	EditText myEd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTv = (TextView) findViewById(R.id.textView1);
        myEd = (EditText) findViewById(R.id.editText1);
        registerForContextMenu(myTv);
    }


    @Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
    	switch(item.getItemId()){
    	case CONTEXT_MENU_1:
    		myEd.setText("你点击了"+item.getItemId()+"选项");
    		break;
    	case CONTEXT_MENU_2:
    		myEd.setText("你点击了"+item.getItemId()+"选项");
    		break;
    	case CONTEXT_MENU_3:
    		myEd.setText("你点击了"+item.getItemId()+"选项");
    		break;
    	}
		return super.onContextItemSelected(item);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
