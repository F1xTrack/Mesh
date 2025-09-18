package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.fragment.app.l;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: Qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1288Qh {
    public final String a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Object f;
    public Object g;
    public Object h;

    public C1288Qh(l lVar, String str, String str2, String str3, String str4, boolean z, QQ0 qq0) {
        O90.f(str, "title");
        this.c = lVar;
        this.a = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.b = z;
        this.g = qq0;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        O90.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.h = executorServiceNewSingleThreadExecutor;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null) {
                message.contains("compressed");
            }
            return null;
        }
    }

    public void b(int i, Serializable serializable) {
        ((Executor) this.c).execute(new RunnableC6690qf(this, i, serializable, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1288Qh(AssetManager assetManager, Executor executor, WD0 wd0, String str, File file) {
        this.b = false;
        this.c = executor;
        this.d = wd0;
        this.a = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        Serializable serializable = null;
        serializable = null;
        serializable = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    serializable = AbstractC5647lB1.e;
                    break;
                case 26:
                    serializable = AbstractC5647lB1.d;
                    break;
                case 27:
                    serializable = AbstractC5647lB1.c;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case 30:
                    serializable = AbstractC5647lB1.b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    serializable = AbstractC5647lB1.a;
                    break;
            }
        }
        this.e = serializable;
    }
}
