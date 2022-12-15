package com.example.smartgarden.data.general;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GeneralDAO_Impl implements GeneralDAO {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePlant;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAddress;

  public GeneralDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfUpdatePlant = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE general SET plantID=? WHERE id=0";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAddress = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE general SET userMail=? WHERE id=0";
        return _query;
      }
    };
  }

  @Override
  public void updatePlant(final int idPlant) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePlant.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, idPlant);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePlant.release(_stmt);
    }
  }

  @Override
  public void updateAddress(final String address) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAddress.acquire();
    int _argIndex = 1;
    if (address == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, address);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateAddress.release(_stmt);
    }
  }

  @Override
  public LiveData<General> readGeneral() {
    final String _sql = "SELECT * FROM general WHERE id=0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"general"}, false, new Callable<General>() {
      @Override
      public General call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPlantID = CursorUtil.getColumnIndexOrThrow(_cursor, "plantID");
          final int _cursorIndexOfUserMail = CursorUtil.getColumnIndexOrThrow(_cursor, "userMail");
          final General _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpPlantID;
            _tmpPlantID = _cursor.getInt(_cursorIndexOfPlantID);
            final String _tmpUserMail;
            if (_cursor.isNull(_cursorIndexOfUserMail)) {
              _tmpUserMail = null;
            } else {
              _tmpUserMail = _cursor.getString(_cursorIndexOfUserMail);
            }
            _result = new General(_tmpId,_tmpPlantID,_tmpUserMail);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
