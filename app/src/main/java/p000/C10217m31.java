package p000;

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
public final class C10217m31 extends GLSurfaceView {

    /* renamed from: a */
    public final CopyOnWriteArrayList f37437a;

    /* renamed from: b */
    public final SensorManager f37438b;

    /* renamed from: c */
    public final Sensor f37439c;

    /* renamed from: d */
    public final C8246Ry0 f37440d;

    /* renamed from: e */
    public final Handler f37441e;

    /* renamed from: f */
    public final C11552wV0 f37442f;

    /* renamed from: g */
    public SurfaceTexture f37443g;

    /* renamed from: h */
    public Surface f37444h;

    /* renamed from: i */
    public boolean f37445i;

    /* renamed from: j */
    public boolean f37446j;

    /* renamed from: k */
    public boolean f37447k;

    public C10217m31(Context context) {
        super(context, null);
        this.f37437a = new CopyOnWriteArrayList();
        this.f37441e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f37438b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f37439c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C11552wV0 c11552wV0 = new C11552wV0();
        this.f37442f = c11552wV0;
        C10089l31 c10089l31 = new C10089l31(this, c11552wV0);
        View.OnTouchListener viewOnTouchListenerC7317Ab1 = new ViewOnTouchListenerC7317Ab1(context, c10089l31);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f37440d = new C8246Ry0(windowManager.getDefaultDisplay(), viewOnTouchListenerC7317Ab1, c10089l31);
        this.f37445i = true;
        setEGLContextClientVersion(2);
        setRenderer(c10089l31);
        setOnTouchListener(viewOnTouchListenerC7317Ab1);
    }

    /* renamed from: a */
    public final void m22646a() {
        boolean z = this.f37445i && this.f37446j;
        Sensor sensor = this.f37439c;
        if (sensor == null || z == this.f37447k) {
            return;
        }
        C8246Ry0 c8246Ry0 = this.f37440d;
        SensorManager sensorManager = this.f37438b;
        if (z) {
            sensorManager.registerListener(c8246Ry0, sensor, 0);
        } else {
            sensorManager.unregisterListener(c8246Ry0);
        }
        this.f37447k = z;
    }

    public InterfaceC0114Bo getCameraMotionListener() {
        return this.f37442f;
    }

    public InterfaceC11581wj1 getVideoFrameMetadataListener() {
        return this.f37442f;
    }

    public Surface getVideoSurface() {
        return this.f37444h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37441e.post(new RunnableC8352Tz0(28, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f37446j = false;
        m22646a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f37446j = true;
        m22646a();
    }

    public void setDefaultStereoMode(int i) {
        this.f37442f.f44923k = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f37445i = z;
        m22646a();
    }
}
