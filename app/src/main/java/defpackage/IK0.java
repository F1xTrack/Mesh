package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class IK0 extends AbstractC7456ug {
    public final /* synthetic */ JK0 c;

    public IK0(JK0 jk0) {
        this.c = jk0;
    }

    @Override // defpackage.AbstractC7456ug, defpackage.InterfaceC6604qC0
    public final AbstractC8446zt a(Bitmap bitmap, N8 n8) {
        JK0 jk0 = this.c;
        Rect rect = new Rect(0, 0, jk0.getWidth(), jk0.getHeight());
        InterfaceC7424uV0 interfaceC7424uV0 = jk0.u;
        Matrix matrix = JK0.I;
        ((AbstractC6268oR1) interfaceC7424uV0).b(matrix, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = jk0.v;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        int width = jk0.getWidth();
        int height = jk0.getHeight();
        n8.getClass();
        AbstractC8446zt abstractC8446ztG = n8.g(width, height, Bitmap.Config.ARGB_8888);
        try {
            new Canvas((Bitmap) abstractC8446ztG.w()).drawRect(rect, paint);
            return abstractC8446ztG.clone();
        } finally {
            AbstractC8446zt.p(abstractC8446ztG);
        }
    }
}
