package ru.ifmo.md.lesson8.content;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class WeatherContract {
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "ru.ifmo.md.lesson8.WeatherDatabase";
    public static final String AUTHORITY = "ru.ifmo.md.lesson8.contentprovider";

    public static final class Cities implements BaseColumns {
        public static final String TABLE_NAME = "places";
        public static final String WOEID_COLUMN = "woeid";
        public static final String NAME_COLUMN = "name";
        public static final String COUNTRY_COLUMN = "country";
        public static final String CREATE_TABLE = "create table "
                + TABLE_NAME + "("
                + "_id integer primary key, "
                + WOEID_COLUMN + " integer, "
                + NAME_COLUMN + " text, "
                + COUNTRY_COLUMN + " text"
                + ")";
        public static final String DELETE_TABLE = "drop table if exists " + Cities.TABLE_NAME;

        public static final String PATH = "places";
        public static final Uri URI = Uri.parse("content://" + AUTHORITY + "/" + PATH);
        public static final String DIR_CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + PATH;
        public static final String ITEM_CONTENT_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + PATH;

        public static final int LIST_ID = 1;
        public static final int ITEM_ID = 2;
    }

    private WeatherContract() {
    }
}
