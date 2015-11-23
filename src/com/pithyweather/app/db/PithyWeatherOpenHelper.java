package com.pithyweather.app.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class PithyWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * Province�������
	 */
	public static final String CREATE_PROVINCE = "CREATE TABLE Province ("
			+ "id integer primary key autoincrement, "
			+ "provice_name text, " 
			+ "provice_code test)";

	/**
	 * City�������
	 */
	public static final String CREATE_CITY = "CREATE TABLE City ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text, "
			+ "province_id integer)";
	
	/**
	 * County�������
	 */
	public static final String CREATE_COUNTY = "CREATE TABLE County ("
			+ "id integer primary key autoincrement, "
			+ "county_name text, "
			+ "county_code text, "
			+ "city_id integer)";
	
	public PithyWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE); //����Province��
		db.execSQL(CREATE_CITY); //����City��
		db.execSQL(CREATE_COUNTY); //����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
