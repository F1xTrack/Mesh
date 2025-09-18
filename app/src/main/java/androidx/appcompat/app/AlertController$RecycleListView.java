package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p000.AbstractC8704aH0;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a */
    public final int f15749a;

    /* renamed from: b */
    public final int f15750b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15442t);
        this.f15750b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f15749a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
