package defpackage;

import java.io.File;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class DO implements D10 {
    public volatile Object a;
    public final Object b;

    public /* synthetic */ DO(Object obj) {
        this.b = obj;
    }

    public Logger a() {
        Logger logger = (Logger) this.a;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.a;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.a = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ZJ b() {
        if (((ZJ) this.a) == null) {
            synchronized (this) {
                try {
                    if (((ZJ) this.a) == null) {
                        File cacheDir = ((A90) ((C0136Bm1) this.b).b).a.getCacheDir();
                        C7008sK c7008sK = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c7008sK = new C7008sK();
                            c7008sK.d = new C4332iN(13, (byte) 0);
                            c7008sK.c = file;
                            c7008sK.a = 262144000L;
                            c7008sK.b = new VH(20);
                        }
                        this.a = c7008sK;
                    }
                    if (((ZJ) this.a) == null) {
                        this.a = new NV1(12);
                    }
                } finally {
                }
            }
        }
        return (ZJ) this.a;
    }

    @Override // defpackage.D10
    public Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Object obj = ((D10) this.b).get();
                        IL1.d(obj, "Argument must not be null");
                        this.a = obj;
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public DO() {
        this.b = AbstractC5608l0.class.getName();
    }
}
