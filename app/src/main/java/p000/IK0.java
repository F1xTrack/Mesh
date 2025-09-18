package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class IK0 extends AbstractC6964ug {

    /* renamed from: c */
    public final /* synthetic */ JK0 f4897c;

    public IK0(JK0 jk0) {
        this.f4897c = jk0;
    }

    @Override // p000.AbstractC6964ug, p000.InterfaceC10747qC0
    /* renamed from: a */
    public final AbstractC7292zt mo3818a(Bitmap bitmap, C0827N8 c0827n8) {
        JK0 jk0 = this.f4897c;
        Rect rect = new Rect(0, 0, jk0.getWidth(), jk0.getHeight());
        InterfaceC11297uV0 interfaceC11297uV0 = jk0.f5479u;
        Matrix matrix = JK0.f5458I;
        ((AbstractC10522oR1) interfaceC11297uV0).m23403b(matrix, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = jk0.f5480v;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        int width = jk0.getWidth();
        int height = jk0.getHeight();
        c0827n8.getClass();
        AbstractC7292zt abstractC7292ztM5558g = c0827n8.m5558g(width, height, Bitmap.Config.ARGB_8888);
        try {
            new Canvas((Bitmap) abstractC7292ztM5558g.m26572w()).drawRect(rect, paint);
            return abstractC7292ztM5558g.clone();
        } finally {
            AbstractC7292zt.m26569p(abstractC7292ztM5558g);
        }
    }
}
