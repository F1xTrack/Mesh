package p000;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class JQ0 {
    /* renamed from: a */
    public static void m4315a(Object obj, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
    }

    /* renamed from: b */
    public static Bundle m4316b(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
