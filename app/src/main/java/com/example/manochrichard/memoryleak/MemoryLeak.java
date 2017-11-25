package com.example.manochrichard.memoryleak;

import android.content.Context;

/**
 * Created by Manoch Richard on 25-Nov-17.
 */

public class MemoryLeak {
    private static MemoryLeak ml=null;
    private Context context;
    private MemoryLeak( Context context)
    {
    this.context=context;
    }
    public static  MemoryLeak getMemoryLeak(Context context)
    {
        if(ml==null)
        {
            ml=new MemoryLeak(context);
        }
        return  ml;
    }
}
