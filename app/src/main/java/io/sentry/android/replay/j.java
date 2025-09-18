package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.huawei.hms.framework.common.ContainerUtils;
import defpackage.AbstractC2141aT1;
import defpackage.AbstractC4175hY0;
import defpackage.AbstractC5702lU;
import defpackage.AbstractC7538v51;
import defpackage.AbstractC7680vr;
import defpackage.AbstractC8069xu;
import defpackage.C0713Ix;
import defpackage.C1666Vd;
import defpackage.F71;
import defpackage.InterfaceC3412dY0;
import defpackage.LB;
import defpackage.M8;
import defpackage.O90;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class j implements Closeable {
    public final D1 a;
    public final io.sentry.protocol.t b;
    public final AtomicBoolean c;
    public final Object d;
    public C1666Vd e;
    public final F71 f;
    public final ArrayList g;
    public final LinkedHashMap h;
    public final F71 i;

    public j(D1 d1, io.sentry.protocol.t tVar) {
        O90.f(d1, "options");
        O90.f(tVar, "replayId");
        this.a = d1;
        this.b = tVar;
        this.c = new AtomicBoolean(false);
        this.d = new Object();
        this.f = LB.b(new h(this, 1));
        this.g = new ArrayList();
        this.h = new LinkedHashMap();
        this.i = LB.b(new h(this, 0));
    }

    public final void a(File file) {
        D1 d1 = this.a;
        try {
            if (file.delete()) {
                return;
            }
            d1.getLogger().k(EnumC5148n1.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            d1.getLogger().c(EnumC5148n1.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final boolean c(k kVar) {
        if (kVar == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(kVar.a.getAbsolutePath());
            synchronized (this.d) {
                C1666Vd c1666Vd = this.e;
                if (c1666Vd != null) {
                    O90.e(bitmapDecodeFile, "bitmap");
                    c1666Vd.e(bitmapDecodeFile);
                }
            }
            bitmapDecodeFile.recycle();
            return true;
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            try {
                C1666Vd c1666Vd = this.e;
                if (c1666Vd != null) {
                    c1666Vd.h();
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.set(true);
    }

    public final File m() {
        return (File) this.f.getValue();
    }

    public final synchronized void n(String str, String str2) {
        File file;
        if (this.c.get()) {
            return;
        }
        if (this.h.isEmpty() && (file = (File) this.i.getValue()) != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), AbstractC7680vr.a), 8192);
            try {
                InterfaceC3412dY0 interfaceC3412dY0E = AbstractC4175hY0.e(new M8(2, bufferedReader));
                LinkedHashMap linkedHashMap = this.h;
                Iterator it = ((C0713Ix) interfaceC3412dY0E).iterator();
                while (it.hasNext()) {
                    List listO = AbstractC7538v51.O((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 2, 2);
                    linkedHashMap.put((String) listO.get(0), (String) listO.get(1));
                }
                AbstractC2141aT1.a(bufferedReader, null);
            } finally {
            }
        }
        if (str2 == null) {
            this.h.remove(str);
        } else {
            this.h.put(str, str2);
        }
        File file2 = (File) this.i.getValue();
        if (file2 != null) {
            Set setEntrySet = this.h.entrySet();
            O90.e(setEntrySet, "ongoingSegment.entries");
            AbstractC5702lU.h(file2, AbstractC8069xu.H(setEntrySet, "\n", null, null, b.g, 30));
        }
    }
}
