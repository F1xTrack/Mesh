package ru.rustore.sdk.pushclient.internal.arbiter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.domain.ComponentActions;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.AbstractC9366fP1;
import p000.C4090g1;
import p000.C7821Jt1;
import p000.C8441Vr1;
import p000.F71;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Lru/rustore/sdk/pushclient/internal/arbiter/ArbiterBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "client_release"}, m22268k = 1, m22269mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ArbiterBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final F71 f42140a = AbstractC0705LB.m4915b(new C4090g1(4, this));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.DefaultImpls.info$default((Logger) this.f42140a.getValue(), "Master update broadcast received", null, 2, null);
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != 1854594276 || !action.equals(ComponentActions.MASTER_HOST_UPDATE_ACTION) || C7821Jt1.f5775v == null) {
            return;
        }
        C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
        if (c7821Jt1 == null) {
            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
        }
        Logger.DefaultImpls.info$default(c7821Jt1.f5777b, "Update master", null, 2, null);
        AbstractC9366fP1.m18230b(c7821Jt1.f5794s, null, new C8441Vr1(c7821Jt1, null, 3), 3);
    }
}
