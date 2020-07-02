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

package com.android.shortvideos.videos.core;

import com.android.shortvideos.R;
import com.android.shortvideos.videos.common.BaseDialogFragment;

/**
 * A default full screen dialog fragment with black background.
 *
 * @author eneim | 6/18/17.
 */

public abstract class BlackBoardDialogFragment extends BaseDialogFragment {

  @Override public int getTheme() {
    return R.style.VideoActivityTheme;
  }
}