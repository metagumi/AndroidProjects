package com.metagumi.sylvesterharvey.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by sylvesterharvey on 12/19/16. model layer
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private boolean mSolved;


    public UUID getId() {
        return mId;
    }

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
