/*
 * Copyright (c) 2017 Nam Nguyen, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.shortvideos.videos.common;

import android.net.Uri;

/**
 * @author eneim | 6/6/17.
 */

public enum MediaUrl {
  TEARS_OF_STEELL("https://firebasestorage.googleapis.com/v0/b/appqoute-74a27.appspot.com/o/videos%2FFacebook_2589737934464492(240p)%5B1%5D.mp4?alt=media&token=9cd551cb-b46b-4289-9d4a-f1f0b88045fd", 2.4f), //
  TEARS_OF_STEEL("https://firebasestorage.googleapis.com/v0/b/appqoute-74a27.appspot.com/o/videos%2F%D8%A7%D8%B1%D9%88%D8%B9%20%D9%85%D9%82%D8%B"
      + "7%D8%B9.%20%D8%B5%D9%88%D8%AA%D9%8A%20%D9%82%D8%B1%D8%A7%D9%86%20%D9%83%D8%B1%D9%8A%D9%85.mp4?alt=media&token=cd735afd-62f6-4f3f-94d5-384696ff34bf", 2.4f), //
  BIG_BUCK_BUNNY("https://firebasestorage.googleapis.com/v0/b/appqoute-74a27.appspot.com/o/videos%2FFacebook_undefined(270p)%5B1%5D.mp4?alt=media&token=fdd1c16f-9694-4b55-bd7d-31b80c460d12", 2.4f),  //
  COSMOS_LAUNDROMATY("https://firebasestorage.googleapis.com/v0/b/appqoute-74a27.appspot.com/o/videos%2FFacebook_undefined(360p)%5B1%5D.mp4?alt=media&token=a353776b-9f35-4fde-8fda-57b4b35a471d", 2.4f),;

  private final String url;
  private final float ratio;

  MediaUrl(String url, float ratio) {
    this.url = url;
    this.ratio = ratio;
  }

  MediaUrl(String url) {
    this(url, 1.7777777778f);
  }

  public String getUrl() {
    return url;
  }

  public Uri getUri() {
    return Uri.parse(this.url);
  }

  public float getRatio() {
    return ratio;
  }

  @Override public String toString() {
    return name() + "{" + "url='" + url + '\'' + ", ratio=" + ratio + '}';
  }
}
