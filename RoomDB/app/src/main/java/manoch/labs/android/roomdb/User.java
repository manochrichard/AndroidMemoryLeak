package manoch.labs.android.roomdb;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Manoch Richard on 07-Nov-17.
 */
@Entity
public class User {
    @PrimaryKey
    public final int id;
    public String name;
    public int level;
    public long skillPoints;

    public User(int id, String name, long skillPoints) {
        this.id = id;
        this.name = name;
        this.skillPoints = skillPoints;
        this.level = 0;
    }

    }
}
