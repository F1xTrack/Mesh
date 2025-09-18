package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.AbstractC1743b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10237mD0 extends FrameLayout {

    /* renamed from: a */
    public EnumC9853jD0 f37552a;

    /* renamed from: b */
    public AbstractC9559gw0 f37553b;

    /* renamed from: c */
    public final ZV0 f37554c;

    /* renamed from: d */
    public final C9725iD0 f37555d;

    /* renamed from: e */
    public boolean f37556e;

    /* renamed from: f */
    public final C7560Et0 f37557f;

    /* renamed from: g */
    public final AtomicReference f37558g;

    /* renamed from: h */
    public final C10365nD0 f37559h;

    /* renamed from: i */
    public InterfaceC6766ro f37560i;

    /* renamed from: j */
    public final C8350Ty0 f37561j;

    /* renamed from: k */
    public final ViewOnLayoutChangeListenerC6974uq f37562k;

    /* renamed from: l */
    public final C7978Mu0 f37563l;

    public C10237mD0(Context context) {
        super(context, null, 0, 0);
        this.f37552a = EnumC9853jD0.PERFORMANCE;
        C9725iD0 c9725iD0 = new C9725iD0();
        c9725iD0.f28967h = EnumC9981kD0.FILL_CENTER;
        this.f37555d = c9725iD0;
        this.f37556e = true;
        this.f37557f = new C7560Et0(EnumC10109lD0.f36974a);
        this.f37558g = new AtomicReference();
        this.f37559h = new C10365nD0(c9725iD0);
        this.f37561j = new C8350Ty0(1, this);
        this.f37562k = new ViewOnLayoutChangeListenerC6974uq(2, this);
        this.f37563l = new C7978Mu0(24, this);
        DV1.m1716a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = SG0.f10669a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        AbstractC10944rk1.m24481m(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, c9725iD0.f28967h.f36362a);
            for (EnumC9981kD0 enumC9981kD0 : EnumC9981kD0.values()) {
                if (enumC9981kD0.f36362a == integer) {
                    setScaleType(enumC9981kD0);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (EnumC9853jD0 enumC9853jD0 : EnumC9853jD0.values()) {
                        if (enumC9853jD0.f34982a == integer2) {
                            setImplementationMode(enumC9853jD0);
                            typedArrayObtainStyledAttributes.recycle();
                            new OJ1(context, new C7754Im0(this, 15));
                            if (getBackground() == null) {
                                setBackgroundColor(AbstractC0691Ky.m4783a(getContext(), R.color.black));
                            }
                            ZV0 zv0 = new ZV0(context, null, 0, 0);
                            zv0.setBackgroundColor(-1);
                            zv0.setAlpha(0.0f);
                            zv0.setElevation(Float.MAX_VALUE);
                            this.f37554c = zv0;
                            zv0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m22703b(Z61 z61, EnumC9853jD0 enumC9853jD0) {
        boolean zEquals = z61.f14741e.mo1341o().mo2402n().equals("androidx.camera.camera2.legacy");
        boolean z = (AbstractC7004vJ.f44326a.m17864z0(SurfaceViewStretchedQuirk.class) == null && AbstractC7004vJ.f44326a.m17864z0(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z) {
            return true;
        }
        int iOrdinal = enumC9853jD0.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + enumC9853jD0);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private InterfaceC11119t60 getScreenFlashInternal() {
        return this.f37554c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(InterfaceC11119t60 interfaceC11119t60) {
        AbstractC7806Jm0.m4412f("PreviewView");
    }

    /* renamed from: a */
    public final void m22704a() {
        Rect rect;
        Display display;
        InterfaceC6766ro interfaceC6766ro;
        DV1.m1716a();
        if (this.f37553b != null) {
            if (this.f37556e && (display = getDisplay()) != null && (interfaceC6766ro = this.f37560i) != null) {
                int iMo2404p = interfaceC6766ro.mo2404p(display.getRotation());
                int rotation = display.getRotation();
                C9725iD0 c9725iD0 = this.f37555d;
                if (c9725iD0.f28966g) {
                    c9725iD0.f28962c = iMo2404p;
                    c9725iD0.f28964e = rotation;
                }
            }
            this.f37553b.m18677j();
        }
        C10365nD0 c10365nD0 = this.f37559h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        c10365nD0.getClass();
        DV1.m1716a();
        synchronized (c10365nD0) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = c10365nD0.f38183c) != null) {
                    c10365nD0.f38184d = c10365nD0.f38182b.m18981a(size, layoutDirection, rect);
                    return;
                }
                c10365nD0.f38184d = null;
            } finally {
            }
        }
    }

    public Bitmap getBitmap() {
        Bitmap bitmapMo6589f;
        DV1.m1716a();
        AbstractC9559gw0 abstractC9559gw0 = this.f37553b;
        if (abstractC9559gw0 == null || (bitmapMo6589f = abstractC9559gw0.mo6589f()) == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) abstractC9559gw0.f28106c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C9725iD0 c9725iD0 = (C9725iD0) abstractC9559gw0.f28107d;
        if (!c9725iD0.m18986f()) {
            return bitmapMo6589f;
        }
        Matrix matrixM18984d = c9725iD0.m18984d();
        RectF rectFM18985e = c9725iD0.m18985e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapMo6589f.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixM18984d);
        matrix.postScale(rectFM18985e.width() / c9725iD0.f28960a.getWidth(), rectFM18985e.height() / c9725iD0.f28960a.getHeight());
        matrix.postTranslate(rectFM18985e.left, rectFM18985e.top);
        canvas.drawBitmap(bitmapMo6589f, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public AbstractC1623Zn getController() {
        DV1.m1716a();
        return null;
    }

    public EnumC9853jD0 getImplementationMode() {
        DV1.m1716a();
        return this.f37552a;
    }

    public AbstractC8024Nr0 getMeteringPointFactory() {
        DV1.m1716a();
        return this.f37559h;
    }

    public C10077kz0 getOutputTransform() {
        Matrix matrixM18983c;
        C9725iD0 c9725iD0 = this.f37555d;
        DV1.m1716a();
        try {
            matrixM18983c = c9725iD0.m18983c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixM18983c = null;
        }
        Rect rect = c9725iD0.f28961b;
        if (matrixM18983c == null || rect == null) {
            AbstractC7806Jm0.m4412f("PreviewView");
            return null;
        }
        RectF rectF = AbstractC11184tc1.f43173a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(AbstractC11184tc1.f43173a, rectF2, Matrix.ScaleToFit.FILL);
        matrixM18983c.preConcat(matrix);
        if (this.f37553b instanceof Q91) {
            matrixM18983c.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            AbstractC7806Jm0.m4412f("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new C10077kz0();
    }

    public AbstractC1743b getPreviewStreamState() {
        return this.f37557f;
    }

    public EnumC9981kD0 getScaleType() {
        DV1.m1716a();
        return this.f37555d.f28967h;
    }

    public InterfaceC11119t60 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        DV1.m1716a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        C9725iD0 c9725iD0 = this.f37555d;
        if (!c9725iD0.m18986f()) {
            return null;
        }
        Matrix matrix = new Matrix(c9725iD0.f28963d);
        matrix.postConcat(c9725iD0.m18983c(size, layoutDirection));
        return matrix;
    }

    public InterfaceC8952cD0 getSurfaceProvider() {
        DV1.m1716a();
        return this.f37563l;
    }

    public C10562ol1 getViewPort() {
        DV1.m1716a();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        DV1.m1716a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new C10562ol1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f37561j, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f37562k);
        AbstractC9559gw0 abstractC9559gw0 = this.f37553b;
        if (abstractC9559gw0 != null) {
            abstractC9559gw0.mo6590g();
        }
        DV1.m1716a();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f37562k);
        AbstractC9559gw0 abstractC9559gw0 = this.f37553b;
        if (abstractC9559gw0 != null) {
            abstractC9559gw0.mo6591h();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f37561j);
    }

    public void setController(AbstractC1623Zn abstractC1623Zn) {
        DV1.m1716a();
        DV1.m1716a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(EnumC9853jD0 enumC9853jD0) {
        DV1.m1716a();
        this.f37552a = enumC9853jD0;
    }

    public void setScaleType(EnumC9981kD0 enumC9981kD0) {
        DV1.m1716a();
        this.f37555d.f28967h = enumC9981kD0;
        m22704a();
        DV1.m1716a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f37554c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        DV1.m1716a();
        this.f37554c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
