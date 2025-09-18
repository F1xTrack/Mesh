package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4421a7 {
    public final I6 a;
    public final List b;
    public final boolean c;

    public C4421a7(I6 i6, ArrayList arrayList, boolean z) {
        this.a = i6;
        this.b = arrayList;
        this.c = z;
    }

    public final String a(Context context, X6 x6) {
        File parentFile;
        try {
            File fileA = this.a.a(context, x6.b());
            if (!fileA.exists() && (parentFile = fileA.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, x6.a(), fileA);
            }
            return fileA.getPath();
        } catch (Throwable unused) {
            return x6.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileA = ((I6) it.next()).a(context, str);
            if (fileA.exists()) {
                try {
                    if (this.c) {
                        FileUtils.copyToNullable(fileA, file);
                    } else {
                        FileUtils.move(fileA, file);
                    }
                    String path = fileA.getPath();
                    String path2 = file.getPath();
                    for (String str2 : AbstractC8259yu.f("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
