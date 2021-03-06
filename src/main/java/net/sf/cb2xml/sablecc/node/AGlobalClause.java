/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class AGlobalClause extends PGlobalClause
{
    private TGlobal _global_;

    public AGlobalClause ()
    {
    }

    public AGlobalClause (TGlobal _global_)
    {
        setGlobal (_global_);
    }

    public Object clone ()
    {
        return new AGlobalClause((TGlobal) cloneNode (_global_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseAGlobalClause (this);
    }

    public TGlobal getGlobal ()
    {
        return _global_;
    }

    public void setGlobal (TGlobal node)
    {
        if (_global_ != null)
        {
            _global_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _global_ = node;
    }

    public String toString ()
    {
        return "" + toString (_global_);
    }

    void removeChild (Node child)
    {
        if (_global_ == child)
        {
            _global_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_global_ == oldChild)
        {
            setGlobal ((TGlobal) newChild);

            return;
        }
    }
}
