package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import ru.mes.dnevnik.R;

/* renamed from: Ry */
/* loaded from: classes.dex */
public final class C1130Ry extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f10498f;

    /* renamed from: a */
    public int f10499a;

    /* renamed from: b */
    public Resources.Theme f10500b;

    /* renamed from: c */
    public LayoutInflater f10501c;

    /* renamed from: d */
    public Configuration f10502d;

    /* renamed from: e */
    public Resources f10503e;

    public C1130Ry(Context context, int i) {
        super(context);
        this.f10499a = i;
    }

    /* renamed from: a */
    public final void m7134a(Configuration configuration) {
        if (this.f10503e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f10502d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f10502d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m7135b() {
        if (this.f10500b == null) {
            this.f10500b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10500b.setTo(theme);
            }
        }
        this.f10500b.applyStyle(this.f10499a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f10503e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f10502d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = p000.C1130Ry.f10498f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p000.C1130Ry.f10498f = r1
        L1c:
            android.content.res.Configuration r1 = p000.C1130Ry.f10498f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f10502d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f10503e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f10503e = r0
        L38:
            android.content.res.Resources r0 = r3.f10503e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1130Ry.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10501c == null) {
            this.f10501c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10501c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f10500b;
        if (theme != null) {
            return theme;
        }
        if (this.f10499a == 0) {
            this.f10499a = R.style.Theme_AppCompat_Light;
        }
        m7135b();
        return this.f10500b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f10499a != i) {
            this.f10499a = i;
            m7135b();
        }
    }
}
