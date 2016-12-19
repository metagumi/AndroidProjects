package com.metagumi.sylvesterharvey.criminalintent;

import java.util.UUID;

/**
 * Created by sylvesterharvey on 12/19/16. model layer
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
