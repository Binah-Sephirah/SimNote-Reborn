package com.example.simnotereborn.db

import android.provider.BaseColumns

object MyDbNameClass {
    const val TABLE_NAME = "SimNote_table"
    const val COLUMN_NAME_TITLE = "SimNote_title"
    const val COLUMN_NAME_CONTENT = "SimNote_content"
    const val COLUMN_NAME_IMAGE_URI = "SimNote_uri"

    const val DATABASE_VERSION = 2
    const val DATABASE_NAME = "SimNoteDb.db"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY,$COLUMN_NAME_TITLE TEXT,$COLUMN_NAME_CONTENT TEXT,$COLUMN_NAME_IMAGE_URI TEXT)"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
}