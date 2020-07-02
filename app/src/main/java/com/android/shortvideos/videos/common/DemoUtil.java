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

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author eneim | 6/8/17.
 */

public class DemoUtil {

  public static int compare(int x, int y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
  }

  public static int compare(long x, long y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
  }

  public static String getFileContent(Context context, String fileName) {
    StringBuilder total = new StringBuilder();
    try (InputStream inputStream = context.getAssets().open(fileName);
         BufferedReader r = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = r.readLine()) != null) {
        total.append(line).append('\n');
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return total.toString();
  }
}
