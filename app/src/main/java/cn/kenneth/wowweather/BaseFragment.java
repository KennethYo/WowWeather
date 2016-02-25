package cn.kenneth.wowweather;

import android.app.Fragment;

import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Kenneth on 2016/2/25.
 */
public abstract class BaseFragment extends Fragment {


    @Override
    public void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = MyApplication.getRefWatcher(getActivity());
        refWatcher.watch(this);
    }
}
