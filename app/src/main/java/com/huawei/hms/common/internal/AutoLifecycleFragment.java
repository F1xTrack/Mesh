package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* loaded from: classes.dex */
public class AutoLifecycleFragment extends Fragment {

    /* renamed from: a */
    private final SparseArray<C2062a> f18915a = new SparseArray<>();

    /* renamed from: b */
    private boolean f18916b;

    /* renamed from: com.huawei.hms.common.internal.AutoLifecycleFragment$a */
    public static class C2062a {

        /* renamed from: a */
        public final HuaweiApiClient f18917a;

        /* renamed from: b */
        protected final int f18918b;

        public C2062a(int i, HuaweiApiClient huaweiApiClient) {
            this.f18917a = huaweiApiClient;
            this.f18918b = i;
        }

        /* renamed from: a */
        public void m11595a() {
            this.f18917a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f18916b = true;
        for (int i = 0; i < this.f18915a.size(); i++) {
            this.f18915a.valueAt(i).f18917a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f18916b = false;
        for (int i = 0; i < this.f18915a.size(); i++) {
            this.f18915a.valueAt(i).f18917a.disconnect();
        }
    }

    public void startAutoMange(int i, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.f18915a.indexOfKey(i) < 0, "Already managing a HuaweiApiClient with this clientId: " + i);
        this.f18915a.put(i, new C2062a(i, huaweiApiClient));
        if (this.f18916b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i) {
        C2062a c2062a = this.f18915a.get(i);
        this.f18915a.remove(i);
        if (c2062a != null) {
            c2062a.m11595a();
        }
    }
}
