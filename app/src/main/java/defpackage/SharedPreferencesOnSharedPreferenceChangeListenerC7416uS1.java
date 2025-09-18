package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: uS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC7416uS1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public /* synthetic */ FR1 a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            FR1 fr1 = this.a;
            fr1.n().o.d("IABTCF_TCString change picked up in listener.");
            ((VA1) Preconditions.checkNotNull(fr1.w)).b(500L);
        }
    }
}
