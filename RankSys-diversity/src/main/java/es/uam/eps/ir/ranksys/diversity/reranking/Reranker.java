/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uam.eps.ir.ranksys.diversity.reranking;

import es.uam.eps.ir.ranksys.core.recommenders.Recommendation;

/**
 *
 * @author saul
 */
public interface Reranker<U, I> {

    public Recommendation<U, I> rerankRecommendation(Recommendation<U, I> recommendation);
}
