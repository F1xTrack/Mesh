package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;

/* renamed from: zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8410zh {
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
