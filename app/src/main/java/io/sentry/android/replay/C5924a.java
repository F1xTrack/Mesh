package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import io.sentry.ThreadFactoryC5748A;
import io.sentry.util.C6173f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import p000.AbstractC8418Vg0;
import p000.C8978cQ0;
import p000.InterfaceC6434mZ;
import p000.N61;
import p000.O90;

/* renamed from: io.sentry.android.replay.a */
/* loaded from: classes2.dex */
public final class C5924a extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: f */
    public static final C5924a f33892f = new C5924a(0, 0);

    /* renamed from: g */
    public static final C5924a f33893g = new C5924a(0, 1);

    /* renamed from: h */
    public static final C5924a f33894h = new C5924a(0, 2);

    /* renamed from: i */
    public static final C5924a f33895i = new C5924a(0, 3);

    /* renamed from: j */
    public static final C5924a f33896j = new C5924a(0, 4);

    /* renamed from: k */
    public static final C5924a f33897k = new C5924a(0, 5);

    /* renamed from: l */
    public static final C5924a f33898l = new C5924a(0, 6);

    /* renamed from: m */
    public static final C5924a f33899m = new C5924a(0, 7);

    /* renamed from: n */
    public static final C5924a f33900n = new C5924a(0, 8);

    /* renamed from: o */
    public static final C5924a f33901o = new C5924a(0, 9);

    /* renamed from: p */
    public static final C5924a f33902p = new C5924a(0, 10);

    /* renamed from: q */
    public static final C5924a f33903q = new C5924a(0, 11);

    /* renamed from: e */
    public final /* synthetic */ int f33904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5924a(int i, int i2) {
        super(i);
        this.f33904e = i2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws NoSuchFieldException, SecurityException {
        Method method;
        switch (this.f33904e) {
            case 0:
                return new C8978cQ0("_[a-z]");
            case 1:
                return new C6173f();
            case 2:
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC5748A(2));
            case 3:
                C5957q c5957q = new C5957q();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new N61(20, c5957q));
                return c5957q;
            case 4:
                return new Paint();
            case 5:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                O90.m5967e(bitmapCreateBitmap, "createBitmap(\n          ….Config.RGB_565\n        )");
                return bitmapCreateBitmap;
            case 6:
                Class cls = (Class) C5976x.f34067a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 7:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable unused) {
                    return null;
                }
            case 8:
                Class cls2 = (Class) C5976x.f34067a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 9:
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC5748A(3));
            case 10:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                Class cls3 = (Class) AbstractC5923A.f33876a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused3) {
                    cls3.toString();
                    return null;
                }
        }
    }
}
