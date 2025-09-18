package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import java.lang.reflect.Field;
import java.util.List;
import p000.AbstractC11374v51;
import p000.O90;

/* renamed from: io.sentry.android.replay.util.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5963b {
    /* renamed from: a */
    public static final Rect m21677a(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        O90.m5968f(layoutCoordinates, "<this>");
        if (layoutCoordinates2 == null) {
            layoutCoordinates2 = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        }
        float f = IntSize.getWidth-impl(layoutCoordinates2.getSize-YbymL2g());
        float f2 = IntSize.getHeight-impl(layoutCoordinates2.getSize-YbymL2g());
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, (Object) null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > f) {
            left = f;
        }
        float top = rectLocalBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f2) {
            top = f2;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= f) {
            f = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f3 = bottom >= 0.0f ? bottom : 0.0f;
        if (f3 <= f2) {
            f2 = f3;
        }
        if (left == f || top == f2) {
            return new Rect();
        }
        long j = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, top));
        long j2 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f, top));
        long j3 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f, f2));
        long j4 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, f2));
        float f4 = Offset.getX-impl(j);
        float f5 = Offset.getX-impl(j2);
        float f6 = Offset.getX-impl(j4);
        float f7 = Offset.getX-impl(j3);
        float fMin = Math.min(f4, Math.min(f5, Math.min(f6, f7)));
        float fMax = Math.max(f4, Math.max(f5, Math.max(f6, f7)));
        float f8 = Offset.getY-impl(j);
        float f9 = Offset.getY-impl(j2);
        float f10 = Offset.getY-impl(j4);
        float f11 = Offset.getY-impl(j3);
        return new Rect((int) fMin, (int) Math.min(f8, Math.min(f9, Math.min(f10, f11))), (int) fMax, (int) Math.max(f8, Math.max(f9, Math.max(f10, f11))));
    }

    /* renamed from: b */
    public static final Painter m21678b(LayoutNode layoutNode) {
        O90.m5968f(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i = 0; i < size; i++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            if (AbstractC11374v51.m25351p(modifier.getClass().getName(), "Painter", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final C5964c m21679c(LayoutNode layoutNode) {
        ColorProducer colorProducer;
        O90.m5968f(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        Color color = null;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            String name = modifier.getClass().getName();
            if (AbstractC11374v51.m25351p(name, "Text", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                } catch (Throwable unused) {
                }
                color = colorProducer != null ? Color.box-impl(colorProducer.invoke-0d7_KjU()) : null;
            } else if (AbstractC11374v51.m25351p(name, "Fill", false)) {
                z = true;
            }
        }
        return new C5964c(color, z);
    }

    /* renamed from: d */
    public static final boolean m21680d(Painter painter) {
        String name = painter.getClass().getName();
        return (AbstractC11374v51.m25351p(name, "Vector", false) || AbstractC11374v51.m25351p(name, RemoteMessageAttributes.COLOR, false) || AbstractC11374v51.m25351p(name, "Brush", false)) ? false : true;
    }
}
