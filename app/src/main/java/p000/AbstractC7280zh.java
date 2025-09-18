package p000;

import android.app.KeyguardManager;
import android.content.Intent;

/* renamed from: zh */
/* loaded from: classes.dex */
public abstract class AbstractC7280zh {
    /* renamed from: a */
    public static Intent m26513a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
