package p000;

import java.io.File;
import java.util.logging.Logger;

/* renamed from: DO */
/* loaded from: classes.dex */
public final class C0214DO implements D10 {

    /* renamed from: a */
    public volatile Object f1997a;

    /* renamed from: b */
    public final Object f1998b;

    public /* synthetic */ C0214DO(Object obj) {
        this.f1998b = obj;
    }

    /* renamed from: a */
    public Logger m1676a() {
        Logger logger = (Logger) this.f1997a;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.f1997a;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f1998b);
                this.f1997a = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public InterfaceC1593ZJ m1677b() {
        if (((InterfaceC1593ZJ) this.f1997a) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC1593ZJ) this.f1997a) == null) {
                        File cacheDir = ((A90) ((C7391Bm1) this.f1998b).f1022b).f91a.getCacheDir();
                        C6816sK c6816sK = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c6816sK = new C6816sK();
                            c6816sK.f42366d = new C4238iN(13, (byte) 0);
                            c6816sK.f42365c = file;
                            c6816sK.f42363a = 262144000L;
                            c6816sK.f42364b = new C1339VH(20);
                        }
                        this.f1997a = c6816sK;
                    }
                    if (((InterfaceC1593ZJ) this.f1997a) == null) {
                        this.f1997a = new NV1(12);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC1593ZJ) this.f1997a;
    }

    @Override // p000.D10
    public Object get() {
        if (this.f1997a == null) {
            synchronized (this) {
                try {
                    if (this.f1997a == null) {
                        Object obj = ((D10) this.f1998b).get();
                        IL1.m3830d(obj, "Argument must not be null");
                        this.f1997a = obj;
                    }
                } finally {
                }
            }
        }
        return this.f1997a;
    }

    public C0214DO() {
        this.f1998b = AbstractC6336l0.class.getName();
    }
}
