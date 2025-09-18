package p000;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public abstract class LQ0 {
    /* renamed from: a */
    public static int m4969a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    /* renamed from: b */
    public static RemoteInput.Builder m4970b(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
