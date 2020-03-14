class Convert:
    def convert(self, pRootHead):
        if not pRootHead:
            return None
        if not pRootHead.left and not pRootHead.right:
            return pRootHead
        #左子树构建双向链表
        left = self.convert(pRootHead.left)
        p = left
        #找到左子树的最后一个节点
        while p and p.right:
            p = p.right
        if left:
            pRootHead.left = p
            p.right = pRootHead
        right = self.convert(pRootHead.right)
        if right:
            pRootHead.right = right
            right.left = pRootHead
        if left:
            return left
        else: return pRootHead