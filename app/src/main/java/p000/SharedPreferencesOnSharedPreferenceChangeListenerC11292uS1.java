package p000;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: uS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC11292uS1 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public /* synthetic */ FR1 f43697a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            FR1 fr1 = this.f43697a;
            fr1.mo6070n().f8386o.m24555d("IABTCF_TCString change picked up in listener.");
            ((VA1) Preconditions.checkNotNull(fr1.f3224w)).m8322b(500L);
        }
    }
}
