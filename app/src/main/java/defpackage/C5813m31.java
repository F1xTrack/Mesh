package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: m31 */
/* loaded from: classes.dex */
public final class C5813m31 extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final C1418Ry0 d;
    public final Handler e;
    public final C7805wV0 f;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean j;
    public boolean k;

    public C5813m31(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C7805wV0 c7805wV0 = new C7805wV0();
        this.f = c7805wV0;
        C5622l31 c5622l31 = new C5622l31(this, c7805wV0);
        View.OnTouchListener viewOnTouchListenerC0025Ab1 = new ViewOnTouchListenerC0025Ab1(context, c5622l31);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new C1418Ry0(windowManager.getDefaultDisplay(), viewOnTouchListenerC0025Ab1, c5622l31);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(c5622l31);
        setOnTouchListener(viewOnTouchListenerC0025Ab1);
    }

    public final void a() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        C1418Ry0 c1418Ry0 = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(c1418Ry0, sensor, 0);
        } else {
            sensorManager.unregisterListener(c1418Ry0);
        }
        this.k = z;
    }

    public InterfaceC0140Bo getCameraMotionListener() {
        return this.f;
    }

    public InterfaceC7848wj1 getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new RunnableC1577Tz0(28, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.k = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        a();
    }
}
