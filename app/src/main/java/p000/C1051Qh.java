package p000;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.fragment.app.AbstractActivityC1730l;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: Qh */
/* loaded from: classes2.dex */
public final class C1051Qh {

    /* renamed from: a */
    public final String f9730a;

    /* renamed from: b */
    public boolean f9731b;

    /* renamed from: c */
    public final Object f9732c;

    /* renamed from: d */
    public final Object f9733d;

    /* renamed from: e */
    public final Serializable f9734e;

    /* renamed from: f */
    public final Object f9735f;

    /* renamed from: g */
    public Object f9736g;

    /* renamed from: h */
    public Object f9737h;

    public C1051Qh(AbstractActivityC1730l abstractActivityC1730l, String str, String str2, String str3, String str4, boolean z, QQ0 qq0) {
        O90.m5968f(str, "title");
        this.f9732c = abstractActivityC1730l;
        this.f9730a = str;
        this.f9733d = str2;
        this.f9734e = str3;
        this.f9735f = str4;
        this.f9731b = z;
        this.f9736g = qq0;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        O90.m5967e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f9737h = executorServiceNewSingleThreadExecutor;
    }

    /* renamed from: a */
    public FileInputStream m6742a(AssetManager assetManager, String str) {
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

    /* renamed from: b */
    public void m6743b(int i, Serializable serializable) {
        ((Executor) this.f9732c).execute(new RunnableC6694qf(this, i, serializable, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1051Qh(AssetManager assetManager, Executor executor, WD0 wd0, String str, File file) {
        this.f9731b = false;
        this.f9732c = executor;
        this.f9733d = wd0;
        this.f9730a = str;
        this.f9735f = file;
        int i = Build.VERSION.SDK_INT;
        Serializable serializable = null;
        serializable = null;
        serializable = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    serializable = AbstractC10106lB1.f36949e;
                    break;
                case 26:
                    serializable = AbstractC10106lB1.f36948d;
                    break;
                case 27:
                    serializable = AbstractC10106lB1.f36947c;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case 30:
                    serializable = AbstractC10106lB1.f36946b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    serializable = AbstractC10106lB1.f36945a;
                    break;
            }
        }
        this.f9734e = serializable;
    }
}
