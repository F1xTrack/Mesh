package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p000.BinderC10193lt0;
import p000.O90;
import p000.RemoteCallbackListC10321mt0;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    public int f16557a;

    /* renamed from: b */
    public final LinkedHashMap f16558b = new LinkedHashMap();

    /* renamed from: c */
    public final RemoteCallbackListC10321mt0 f16559c = new RemoteCallbackListC10321mt0(this);

    /* renamed from: d */
    public final BinderC10193lt0 f16560d = new BinderC10193lt0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return this.f16560d;
    }
}
