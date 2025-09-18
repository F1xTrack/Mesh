package com.vk.push.core.filedatastore;

import android.content.Context;
import defpackage.AbstractC7625vY1;
import defpackage.C3881g1;
import defpackage.F71;
import defpackage.GK;
import defpackage.InterfaceC0952Lz;
import defpackage.LB;
import defpackage.O90;
import defpackage.QF;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/vk/push/core/filedatastore/FileDataSource;", "", "Landroid/content/Context;", "context", "", "fileName", "LLz;", "scope", "<init>", "(Landroid/content/Context;Ljava/lang/String;LLz;)V", "LPS0;", "getData-IoAF18A", "(LVy;)Ljava/lang/Object;", "getData", "data", "LTf1;", "setData-gIAlu-s", "(Ljava/lang/String;LVy;)Ljava/lang/Object;", "setData", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileDataSource {

    @Deprecated
    public static final String FILE_DATASOURCE_DIR = "vkpns";
    public final Context a;
    public final String b;
    public final InterfaceC0952Lz c;
    public final F71 d;

    public FileDataSource(Context context, String str, InterfaceC0952Lz interfaceC0952Lz) {
        O90.f(context, "context");
        O90.f(str, "fileName");
        O90.f(interfaceC0952Lz, "scope");
        this.a = context;
        this.b = str;
        this.c = interfaceC0952Lz;
        this.d = LB.b(new C3881g1(19, this));
    }

    public static void a(File file) throws IOException {
        if (file.canRead() && file.canWrite()) {
            return;
        }
        throw new IOException("Can't access " + file.getPath());
    }

    public static final File access$getFileSource(FileDataSource fileDataSource) {
        return (File) fileDataSource.d.getValue();
    }

    public static final File access$getOrCreateFile(FileDataSource fileDataSource) throws IOException {
        File file = new File(fileDataSource.a.getFilesDir().getPath() + "/vkpns");
        if ((!file.exists() || !file.isDirectory()) && !file.mkdir()) {
            throw new IOException("Can't create vkpns dir");
        }
        a(file);
        File file2 = new File(file.getPath() + '/' + fileDataSource.b);
        if (file2.exists() && file2.isFile()) {
            a(file2);
        } else {
            boolean zCreateNewFile = file2.createNewFile();
            String str = "Can't create " + file2.getPath() + " file";
            if (!zCreateNewFile) {
                throw new IOException(str);
            }
            a(file2);
        }
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: getData-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m77getDataIoAF18A(defpackage.InterfaceC1729Vy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C6463pT
            if (r0 == 0) goto L13
            r0 = r6
            pT r0 = (defpackage.C6463pT) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pT r0 = new pT
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.RQ1.d(r6)
            Lz r6 = r5.c
            Bz r6 = r6.b()
            qT r2 = new qT
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.AbstractC3767fP1.e(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.filedatastore.FileDataSource.m77getDataIoAF18A(Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: setData-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m78setDatagIAlus(java.lang.String r6, defpackage.InterfaceC1729Vy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C6844rT
            if (r0 == 0) goto L13
            r0 = r7
            rT r0 = (defpackage.C6844rT) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rT r0 = new rT
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.RQ1.d(r7)
            Lz r7 = r5.c
            Bz r7 = r7.b()
            sT r2 = new sT
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.c = r3
            java.lang.Object r7 = defpackage.AbstractC3767fP1.e(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r6 = r7.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.filedatastore.FileDataSource.m78setDatagIAlus(java.lang.String, Vy):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileDataSource(Context context, String str, InterfaceC0952Lz interfaceC0952Lz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            GK gk = GK.a;
            interfaceC0952Lz = AbstractC7625vY1.a(QF.c);
        }
        this(context, str, interfaceC0952Lz);
    }
}
