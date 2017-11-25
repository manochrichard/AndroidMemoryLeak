package manoch.labs.android.roomdb;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Manoch Richard on 07-Nov-17.
 */


@Entity(tableName = "trophy",
        foreignKeys = {
                @ForeignKey(
                        entity = User.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = ForeignKey.CASCADE
                )},
        indices = { @Index(value = "id")}
)
public class Trophy {

    @PrimaryKey(autoGenerate = true)
    long id;

    public long userId;

    String description;

    public Trophy(long userId, String description) {
        this.userId = userId;
        this.description = description;
    }
}
