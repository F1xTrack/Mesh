package com.yalantis.ucrop.task;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import com.yalantis.ucrop.UCropActivity;
import java.io.File;
import java.io.IOException;
import p000.C11249u70;
import p000.C6347lB;
import p000.C6679qQ;
import p000.L21;

/* loaded from: classes2.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    public Bitmap f20639a;

    /* renamed from: b */
    public final RectF f20640b;

    /* renamed from: c */
    public final RectF f20641c;

    /* renamed from: d */
    public float f20642d;

    /* renamed from: e */
    public final float f20643e;

    /* renamed from: f */
    public final int f20644f;

    /* renamed from: g */
    public final int f20645g;

    /* renamed from: h */
    public final Bitmap.CompressFormat f20646h;

    /* renamed from: i */
    public final int f20647i;

    /* renamed from: j */
    public final String f20648j;

    /* renamed from: k */
    public final String f20649k;

    /* renamed from: l */
    public final C6679qQ f20650l;

    /* renamed from: m */
    public final L21 f20651m;

    /* renamed from: n */
    public int f20652n;

    /* renamed from: o */
    public int f20653o;

    /* renamed from: p */
    public int f20654p;

    /* renamed from: q */
    public int f20655q;

    static {
        System.loadLibrary("ucrop");
    }

    public BitmapCropTask(Bitmap bitmap, C11249u70 c11249u70, C6347lB c6347lB, L21 l21) {
        this.f20639a = bitmap;
        this.f20640b = (RectF) c11249u70.f43528c;
        this.f20641c = (RectF) c11249u70.f43529d;
        this.f20642d = c11249u70.f43526a;
        this.f20643e = c11249u70.f43527b;
        this.f20644f = c6347lB.f36932a;
        this.f20645g = c6347lB.f36933b;
        this.f20646h = c6347lB.f36934c;
        this.f20647i = c6347lB.f36935d;
        this.f20648j = c6347lB.f36936e;
        this.f20649k = c6347lB.f36937f;
        this.f20650l = c6347lB.f36938g;
        this.f20651m = l21;
    }

    public static native boolean cropCImg(String str, String str2, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8) throws IOException, OutOfMemoryError;

    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m13762a(float r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.task.BitmapCropTask.m13762a(float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Throwable doInBackground(java.lang.Void[] r5) {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
            android.graphics.Bitmap r5 = r4.f20639a
            if (r5 != 0) goto Lf
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "ViewBitmap is null"
            r5.<init>(r0)
            goto Lac
        Lf:
            boolean r5 = r5.isRecycled()
            if (r5 == 0) goto L1e
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "ViewBitmap is recycled"
            r5.<init>(r0)
            goto Lac
        L1e:
            android.graphics.RectF r5 = r4.f20641c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L2f
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "CurrentImageRect is empty"
            r5.<init>(r0)
            goto Lac
        L2f:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r0 = 1
            r5.inJustDecodeBounds = r0
            java.lang.String r1 = r4.f20648j
            android.graphics.BitmapFactory.decodeFile(r1, r5)
            qQ r1 = r4.f20650l
            int r1 = r1.f40864b
            r2 = 90
            if (r1 == r2) goto L4a
            r2 = 270(0x10e, float:3.78E-43)
            if (r1 != r2) goto L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            if (r0 == 0) goto L4f
            int r1 = r5.outHeight
            goto L51
        L4f:
            int r1 = r5.outWidth
        L51:
            float r1 = (float) r1
            android.graphics.Bitmap r2 = r4.f20639a
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            if (r0 == 0) goto L5f
            int r5 = r5.outWidth
            goto L61
        L5f:
            int r5 = r5.outHeight
        L61:
            float r5 = (float) r5
            android.graphics.Bitmap r0 = r4.f20639a
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r5 = java.lang.Math.min(r1, r5)
            float r0 = r4.f20642d
            float r0 = r0 / r5
            r4.f20642d = r0
            int r5 = r4.f20644f
            if (r5 <= 0) goto La2
            int r0 = r4.f20645g
            if (r0 <= 0) goto La2
            android.graphics.RectF r1 = r4.f20640b
            float r2 = r1.width()
            float r3 = r4.f20642d
            float r2 = r2 / r3
            float r1 = r1.height()
            float r3 = r4.f20642d
            float r1 = r1 / r3
            float r5 = (float) r5
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 > 0) goto L95
            float r3 = (float) r0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto La2
        L95:
            float r5 = r5 / r2
            float r0 = (float) r0
            float r0 = r0 / r1
            float r5 = java.lang.Math.min(r5, r0)
            float r0 = r4.f20642d
            float r0 = r0 / r5
            r4.f20642d = r0
            goto La4
        La2:
            r5 = 1065353216(0x3f800000, float:1.0)
        La4:
            r4.m13762a(r5)     // Catch: java.lang.Throwable -> Lab
            r5 = 0
            r4.f20639a = r5     // Catch: java.lang.Throwable -> Lab
            goto Lac
        Lab:
            r5 = move-exception
        Lac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.task.BitmapCropTask.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Throwable th) {
        Throwable th2 = th;
        L21 l21 = this.f20651m;
        if (l21 != null) {
            UCropActivity uCropActivity = (UCropActivity) l21.f6473b;
            if (th2 != null) {
                uCropActivity.m13760l(th2);
                uCropActivity.finish();
                return;
            }
            Uri uriFromFile = Uri.fromFile(new File(this.f20649k));
            int i = this.f20654p;
            int i2 = this.f20655q;
            int i3 = this.f20652n;
            uCropActivity.setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uriFromFile).putExtra("com.yalantis.ucrop.CropAspectRatio", uCropActivity.f20631s.getTargetAspectRatio()).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", this.f20653o).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
            uCropActivity.finish();
        }
    }
}
