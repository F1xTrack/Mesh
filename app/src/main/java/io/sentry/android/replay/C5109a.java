package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import defpackage.AbstractC1676Vg0;
import defpackage.C2512cQ0;
import defpackage.InterfaceC5908mZ;
import defpackage.N61;
import defpackage.O90;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;

/* renamed from: io.sentry.android.replay.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5109a extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public static final C5109a f = new C5109a(0, 0);
    public static final C5109a g = new C5109a(0, 1);
    public static final C5109a h = new C5109a(0, 2);
    public static final C5109a i = new C5109a(0, 3);
    public static final C5109a j = new C5109a(0, 4);
    public static final C5109a k = new C5109a(0, 5);
    public static final C5109a l = new C5109a(0, 6);
    public static final C5109a m = new C5109a(0, 7);
    public static final C5109a n = new C5109a(0, 8);
    public static final C5109a o = new C5109a(0, 9);
    public static final C5109a p = new C5109a(0, 10);
    public static final C5109a q = new C5109a(0, 11);
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5109a(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws NoSuchFieldException, SecurityException {
        Method method;
        switch (this.e) {
            case 0:
                return new C2512cQ0("_[a-z]");
            case 1:
                return new io.sentry.util.f();
            case 2:
                return Executors.newSingleThreadScheduledExecutor(new io.sentry.A(2));
            case 3:
                q qVar = new q();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new N61(20, qVar));
                return qVar;
            case 4:
                return new Paint();
            case 5:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                O90.e(bitmapCreateBitmap, "createBitmap(\n          ….Config.RGB_565\n        )");
                return bitmapCreateBitmap;
            case 6:
                Class cls = (Class) x.a.getValue();
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
                Class cls2 = (Class) x.a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 9:
                return Executors.newSingleThreadScheduledExecutor(new io.sentry.A(3));
            case 10:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                Class cls3 = (Class) A.a.getValue();
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
