package cn.edu.hbuas.sl.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FEEDBACK".
*/
public class FeedbackDao extends AbstractDao<Feedback, Long> {

    public static final String TABLENAME = "FEEDBACK";

    /**
     * Properties of entity Feedback.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, Long.class, "_id", true, "_id");
        public final static Property Content = new Property(1, String.class, "content", false, "CONTENT");
        public final static Property Tel = new Property(2, String.class, "tel", false, "TEL");
    }


    public FeedbackDao(DaoConfig config) {
        super(config);
    }
    
    public FeedbackDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FEEDBACK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: _id
                "\"CONTENT\" TEXT," + // 1: content
                "\"TEL\" TEXT);"); // 2: tel
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FEEDBACK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Feedback entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(2, content);
        }
 
        String tel = entity.getTel();
        if (tel != null) {
            stmt.bindString(3, tel);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Feedback entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(2, content);
        }
 
        String tel = entity.getTel();
        if (tel != null) {
            stmt.bindString(3, tel);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Feedback readEntity(Cursor cursor, int offset) {
        Feedback entity = new Feedback( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // content
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // tel
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Feedback entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setContent(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTel(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Feedback entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Feedback entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Feedback entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}