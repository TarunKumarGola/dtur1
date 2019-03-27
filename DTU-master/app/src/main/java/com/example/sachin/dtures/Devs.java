/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.sachin.dtures;

public class Devs {

    private String name;

    private String mail;

    // Drawable resource ID
    private int photo;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param vName is the name of the Android version (e.g. Gingerbread)
    * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public Devs(String vName, String vMail, int imageResourceId)
    {
        name = vName;
        mail = vMail;
        photo = imageResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getName() {
        return name;
    }

    /**
     * Get the Android version number
     */
    public String getMail() {
        return mail;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return photo;
    }


}
