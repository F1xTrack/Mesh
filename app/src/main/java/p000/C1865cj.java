package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cj */
/* loaded from: classes2.dex */
public final class C1865cj extends BroadcastReceiver {

    /* renamed from: a */
    public boolean f17695a = false;

    /* renamed from: b */
    public final /* synthetic */ C3946dj f17696b;

    public C1865cj(C3946dj c3946dj) {
        this.f17696b = c3946dj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        this.f17696b.m17730f();
    }
}
